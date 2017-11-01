package com.company;

public class Main {

    public static void main(String[] args) {
	int i1=0,i2=0,i3=0,i4=0,i5=0,i6=0,i7=0,i8=0,i9=0,i10=0,i11=0;
int len=4;
int upper=3 ;
	while (true){
        i1++;
	    if(i1==upper)
        {
            i1=0; i2++;

        }
        if(i2==upper)
        {
            i2=0; i3++;
            if(len==2)
                break;
        }
        if(i3==upper)
        {   i3=0; i4++;
            if(len==3)
                break;
        }
        if(i4==upper)
        {
            i4=0; i5++;
            if(len==4)
                break;
        }
        if(i5==upper)
        {
            i5=0; i6++;
            if(len==5)
                break;
        }
        if(i6==upper)
        {
            i6=0; i7++;
            if(len==6)
                break;
        }
        if(i7==upper)
        {
            i7=0; i8++;
            if(len==7)
                break;
        }
        if(i8==upper)
        {
            i8=0; i9++;
            if(len==8)
                break;
        }
        if(i9==upper)
        {
            i9=0; i10++;
            if(len==9)
                break;
        }
        if(i10==upper)
        {
            i10=0; i11++;
            if(len==10)
                break;
        }
        if(i11==upper)
        {
            i11=0; i11++;
            if(len==11)
                break;
        }
if (len==8)
        System.out.println(i1+" "+ i2 +" "+i3+" "+i4+" "+i5+" "+i6+" "+i7+" "+i8);
        if (len==4)
            System.out.println(i1+" "+ i2 +" "+i3+" "+i4);
    }


    }
}
