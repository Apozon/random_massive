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
fun randomArray (n:Int) : ArrayList<Array<Int>> {
    if (n < 1) return ArrayList()
    val num = n-1
    var shuffleSize = 1024
    if (n>shuffleSize) shuffleSize = n
    val arraySize = MutableList(shuffleSize) { i -> i + 1 }
    arraySize.shuffle()
    val shuffleArray = arraySize.toTypedArray()
    val mainArray = ArrayList<Array<Int>>(num)
    for (id in 0..num) {
        mainArray.add(Array(shuffleArray[id]) {
            Random.nextInt()
        })
    }
    for (main_id in 0..num){
        if (main_id%2==0 || main_id==0) mainArray[main_id] = mainArray[main_id].sortedArray()
            else mainArray[main_id] = mainArray[main_id].sortedArrayDescending()
    }
    return mainArray
}
