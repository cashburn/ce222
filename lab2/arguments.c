#include <stdio.h>
int main(int argc, char *argv[])
{
    int i;
    printf("this program is called " );
    puts (argv[0] );
    printf( "and there are %d arguments including the program name argument 0)\n", argc );
    i = 1;
    while ( i < argc )
    {
        printf( "argument %d is ", i );
        puts (argv[i] );
        i = i+1;
    }
}
