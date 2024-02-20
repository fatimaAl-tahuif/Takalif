public class test {
    public static void main(String[] args) {
        singleLinkedList<Integer>list=new singleLinkedList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.addFirst(11);
        list.addLast(12);
        list.addLast(13);

        while (!list.isEmpty()){
            System.out.println(list.removeFirst()+" ");
        }
    }
}
/*
ينشئ الكود قائمة مرتبطة فارغة.
يتحقق من حجمها وخواصها (فارغة).
يضيف 3 عناصر (11, 12, 13) إلى القائمة.
يستخدم حلقة while لحذف كل عنصر وطباعته بشكل منفصل.
 */
