#include<conio.h>
#include<stdio.h>
#include<math.h>
int main()
{
	int i,n;
	float x[12],y[12],a[2],b[2],m;
	printf("enter the no to be sort n=");
	scanf("%d",&n);
	printf("enter %d below\n",n);
	for(i=0;i<n;i++)
	{
		printf("\n (x[%d],y[%d])=",i,i);
		scanf("%f %f",&x[i],&y[i]);
	}
	printf("caution:points on the line and points which are to be sort should be different");
	printf("enter two points on the line");
	for(i=0;i<2;i++)
	{
		printf("\n (a[%d],b[%d])=",i,i);
		scanf("%f%f",&a[i],&b[i]);
	}
	if((a[1]-a[0])==0)
	{
		for(i=0;i<n;i++)
		if(x[i]==a[0])
		printf("\n(%f%f) point lies on the given line.",x[i],y[i]);
		else
		printf("\n(%f,%f) point does not lie on the given line",x[i],y[i]);
	}
	else
	{
		m=((b[1]-b[0])/(a[1]-a[0]));
		printf("\n slope of line m=%f",m);
		for(i=0;i<n;i++)
		{
			if((b[1]-y[i])/(a[1]-x[i])==m);
			printf("\n(%f,%f) does not lie on the line",x[i],y[i]);			
		}
	}
	getch();
	return 0;
}
