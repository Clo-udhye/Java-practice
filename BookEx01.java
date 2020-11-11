class Book{
    String title;
    String author;
    int price;

    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

public class BookEx01{
    public static void main(String[] args){
        //객체를 참조하는 배열
        int[] arr1 = new int[3];

        //2차원배열
        Book[] arr2 = new Book[3];  //Book형을 넣을수있는 배열이 생성
        
        Book book1 = new Book("Java", "홍길동", 1000);
        Book book2 = new Book("JSP", "박문수", 2000);
        Book book3 = new Book("Spring", "이몽룡", 3000);

        arr2[0] = book1;
        arr2[1] = book2;
        arr2[2] = book3;

        System.out.println(arr2.length);
        /*
        for( int i=0; i<arr2.length; i++){
            System.out.println(arr2[i].title +"\t"+arr2[i].author+"\t"+arr2[i].price+"원");
        }
        */
        for( int i=0; i<arr2.length; i++){
            Book book = arr2[i];
            System.out.println(book.title +"\t"+book.author+"\t"+book.price+"원");
        }
        /*
        //향상된 for문으로 접근하기 
        for(Book bookData : arr2){
            System.out.println(bookData.title +"\t"+bookData.author+"\t"+bookData.price+"원");
        }
        */
    }
}