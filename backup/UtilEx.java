public class UtilEx{
    public String capitalizeName ( String name ){
        String[] names = name.split(" ");
            
        String result="";
        for( String name1 : names ){
            result += name1.substring(0, 1).toUpperCase() + name1.substring( 1 ) + " ";
        }

        return result.trim();
    }
}