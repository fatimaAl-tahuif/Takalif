public class Q4 {
    public static void main(String[] args) {
        singleLinkedList<Integer>list=new singleLinkedList<>();

        list.addFirst(11);
        list.addLast(12);
        list.addLast(13);
        list.addLast(14);
        list.addLast(15);
list.rotate();
        while (!list.isEmpty()){
            System.out.print("  "+list.removeFirst()+" ");
        }
    }
}
/*
ينشئ الكود قائمة مرتبطة ويضيف إليها عناصر.
يدور القائمة باستخدام طريقة rotate (غير محددة).
يطبع عناصر القائمة الواحد تلو الآخر بعد حذفها من البداية.
 */