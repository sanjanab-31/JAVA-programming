public class ArrayDatatype {
    public static void main(String[] args) {
        int[] arrint = new int[5];
        float[] arrfloat = new float[5];
        char[] arrchar = new char[5];
        arrint[0]=1;
        arrint[1]=2;
        arrint[2]=3;
        arrfloat[0]=1.1f;
        arrfloat[1]=2.2f;  
        arrfloat[2]=3.3f;
        arrchar[0]='a';
        arrchar[1]='b';
        arrchar[2]='c';
        System.out.println("Integer Array:");
        for(int i=0;i<5;i++)
        {
            System.out.println(arrint[i]);
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(arrfloat[i]);

        }
        for(int i=0;i<5;i++)
        {
            System.out.println(arrchar[i]);
        }
    }
}
