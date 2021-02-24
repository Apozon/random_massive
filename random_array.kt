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
    var array_size = MutableList<Int>(1024, { i -> i+1})
    Collections.shuffle(array_size)
    val shuffle_array = array_size.toTypedArray()
    var main_array = ArrayList<Array<Int>>(n-1)
    for (id in 0..n-1) {
        main_array.add(Array(shuffle_array[id], { Random.nextInt() }))
    }
    for (main_id in 0..n-1 step 2) main_array[main_id] =  main_array[main_id].sortedArray()
    for (main_id in 1..n-1 step 2) main_array[main_id] =  main_array[main_id].sortedArrayDescending()
    return main_array
}
