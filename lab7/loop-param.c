
#define PARAMETER   53687

int xarray [PARAMETER] [1000] [10];

int main () {
  printf("%d", sizeof(int));
  int i, j, k;

  for( i=0; i<PARAMETER; i++ )
      for( j=0; j<1000; j++ )
	for( k=0; k<10; k++ )
	  xarray[i][j][k] =  xarray[k][i][j];

}

