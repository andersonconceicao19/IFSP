#include <iostream>
using namespace std;

int MediaArray(int valor[])
{
	int total = 0;
	for(int i =0; i<10;i++)
	{
		total+=valor[i];
	}	
	total = total / 10;
	
	return total;
}
void MaiorQueAMedia(int media, int array[])
{
	for(int i=0; i <10;i++)
	{
		if(array[i] > media)
		{
			cout<< "O valor: " << array[i] << " é maior que a media: " << media << endl;
		}
	}
	
}

int main(int argc, char** argv)
{
	int v1[10] = {10, 3, 5, 2, 12, 6, 9, 1, 23, 4};
	int media;
	
	media = MediaArray(v1);
	//cout << media << endl;
	MaiorQueAMedia(media, v1);
	return 0;
}