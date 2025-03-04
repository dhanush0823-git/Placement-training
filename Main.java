class Main 
{
    public static void main (String []args)
    {
        String str = "Hey ";
        str = str.concat ("Dhanush!");
        System.out.println("String : " + str);
        
        
        StringBuilder sb = new StringBuilder(" Hello ");
        sb.append("Everyone");
        System.out.println("StringBuilder :"+sb);
        
        StringBuffer buff = new StringBuffer (" Hello ");
        buff.append("Triloch");
        System.out.println("StringBuffer :"+buff);
        
        char[] chars = {'D','h','a','n','u','s','h','!'};

        String result =" ";
        for( char c : chars)
        {
                    result += c;


        }
        System.out.println("Without Builtin :"+result);
        
        
    }
}