class Main{
public static void main(String[] args){
Man m =new Man();
System.out.println(m.color);
System.out.println(m.point);
System.out.println(m.type);
System.out.println(m.clicked);
m.click();
System.out.println(m.clicked);
}
}