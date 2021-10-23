public class basicStringOperations {
    public static void main(String args[]) {
        // Some Basic Operations Of String 
        String name = "shershah";
        String name1 = "Shershah";
        // NOTE: Strings Re Immutable Remember
        //We Can Only Change Them By Completing Thier Complete Reference
        //Lets Take An Example

        //Replace Method

        name = name.replace("s", "k");
        System.out.println(name);
        name = name.replace("kher","karn");
        System.out.println(name);
        //In This We Completely Change The Name String And In All Other Methods

        

        //Some More Operations

        //Finding Length Of String

        System.out.println(name.length());

        //Converting To LOWER/UPPER Cases

        name1 =name1.toLowerCase();
        System.out.println(name1);
        System.out.println(name1.toUpperCase());
        
        //Finding SubString Of A String

        name = name.substring(1);
        name1= name1.substring(1,4);
        /* NOTE: substring can be done in two ways by giving first index as well
        as ending index  or simply by giving one index only ,the two indexing parameter
        takes the (ending-1) so give the second index as (index+1) always*/ 
        System.out.println(name);
        System.out.println(name1);

        //Equals

        System.out.println(name.equals(name1));
        System.out.println(name.equalsIgnoreCase("shershah"));
        // Returns A Bolleon Value

        //Trim Method

        String n="  sher   ";
        System.out.println(n.trim());
        //removes all spaces from a string 

        //Starts With Ends With

        System.out.println(name.startsWith("ar"));
        System.out.println(name.endsWith("ah"));
        //returns a bollean value

        // char at and Index of and last index of

        System.out.println(name);
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("ah"));
        System.out.println(name.indexOf("h", 4));

        String cla="AMAZON";
        System.out.println(cla.lastIndexOf("A"));
        System.out.println(cla.lastIndexOf("A",1));

        //REMEMBER INDEX OF AND LAST INDEX OF ARE DIFFERENT WITH TWO PARAMETERS 
        //LASTINDEX OF SEARCHES TILL THAT INDEX AND INDEXOF SEARCHES AFTER THAT INDEX






        



        
    }
    
}
