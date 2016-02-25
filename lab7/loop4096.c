#include <sys/time.h>
#include <stdlib.h>
#include <stdio.h>


int main(int argc, char **argv) {
  char *buffer;
  int size, count;
  int i, j;
  struct timeval start, end;
  double timetaken, timetaken2;
  

/* read in number of size of buffer */ 

  if (argc < 2) {
    printf("Usage: loop <blocks in buffer> <times through buffer>\n");
    exit(-1);
  }
 
/* create a buffer of the right size -
   malloc asks the operating system for a block of store of a the given size, 
   which is size * 4K bytes  */

  size = atoi(argv[1]);
  buffer = malloc(size*4096);

  /* read in the number of times you will go through the buffer */

  count = atoi(argv[2]);


/* for COUNT times, 
	go through the buffer writing in the relevant address */ 

  gettimeofday(&start, NULL);
  for (j=0;j<count;j++)
    for (i=0;i<size;i++) {
      buffer[i*4096+4095] = 0;
    }
  gettimeofday(&end, NULL);


/* calculate the time taken */
  
  timetaken = (end.tv_sec-start.tv_sec)*1000000 + (end.tv_usec-start.tv_usec);

  timetaken2 = (timetaken/size)/count;

  printf("blocks %i   times through %i   total time %g     time per access %g \n", 
	 size, count, timetaken, timetaken2 );
}
