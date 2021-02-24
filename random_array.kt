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
        var massive_size = MutableList<Int>(1024, { i -> i+1})
        Collections.shuffle(massive_size)
        val shuffle_massive = massive_size.toTypedArray()
        var main_massive = ArrayList<Array<Int>>(n)
        for (id in 0..n) {
            main_massive.add(Array(shuffle_massive[id], { Random.nextInt() }))
        }
                for (main_id in 0..n step 2) main_massive[main_id].sortedArray()
                for (main_id in 1..n step 2) main_massive[main_id].sortedArrayDescending()
                return main_massive
    }











