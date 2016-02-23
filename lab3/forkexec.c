  #include <stdio.h>
  #include <stdlib.h>
  #include <unistd.h>

  int main(int argc, char **argv)
  {
    int pid;
    if (argc==1)
    {
      printf("Usage: forkexec <command> [<parameters>]\n"); 
      exit(1);
    }
    if (!(pid = fork())) {
      execv(argv[1], &argv[1]); 
      printf("Sorry...   couldn't run that!\n");
    }
    printf("Started process %d: %s\n", pid, argv[1]);
    sleep(30);
  }
