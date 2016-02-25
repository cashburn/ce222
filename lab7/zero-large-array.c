#include <stdlib.h>

int large_array[10000000];

int main(int argc, char *argv[]){

  int i;

  system("ps l"); /* note: letter l */

  for ( i=0; i<10000000; ++i ) {
    large_array[i] = 33;
  };

  system("ps l"); /* note: letter l */

  return large_array[0];
}
