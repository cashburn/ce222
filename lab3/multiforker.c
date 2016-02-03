#include <unistd.h>
#include <stdio.h>

int main(int argc, char **argv){
  FILE * fp = fopen("/ufs/servc03/users/ceashb/Documents/ce222/lab3/multifork-log.txt", "a");
  int pid;
  fflush(fp);
  for(int i = 0; i < 3; i++){  /* loops 3 times */
    sleep(3);
    fprintf(stdout,"Multiforker PID %d round %d\n", getpid(), i+1);
    if (pid = fork())                /* each time calling fork */
        fprintf(stdout,"parent %d created child %d\n", getpid(), pid);
    else
        fprintf(stdout,"inside child %d\n", getpid());
  }
  sleep(30);               /* then sleeps 30 seconds */
  fclose(fp);
}
