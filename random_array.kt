import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random
/*На входе функция получает параметр n - натуральное число.
Необходимо сгенерировать n-массивов, заполнить их случайными числами, каждый массив имеет случайный размер.
Размеры массивов не должны совпадать.
Далее необходимо отсортировать массивы.
Массивы с четным порядковым номером отсортировать по возрастанию, с нечетным порядковым номером - по убыванию.
На выходе функция должна вернуть массив с отсортированными массивами.
*/

    fun random_array (n:Int) : ArrayList<Array<Int>> {
        if (n < 1) return ArrayList()
        var massive_size = MutableList<Int>(1024, { i -> i + i })
        Collections.shuffle(massive_size)
        val shuffle_massive = massive_size.toTypedArray()
        var main_massive = ArrayList<Array<Int>>(n)
            for (main_id in 0..n) {
                for (id in 0..n) {
                    if (main_id % 2 == 0 && main_id == 0) {
                        main_massive.add(Array(shuffle_massive[id], { Random.nextInt() }).sortedArray())
                    } else {
                        main_massive.add(Array(shuffle_massive[id], { Random.nextInt() }).sortedArrayDescending())
                    }
                }

            }
        return main_massive
    }











