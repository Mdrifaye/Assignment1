#include<stdio.h>
#include<conio.h>
#include<math.h>

 void main() { 
 int date, month, year,day_of_week; 
 //clrscr();
 printf("\nEnter the year "); 
 scanf("%d", &year); 
 printf("\nEnter the month "); 
 scanf("%d", &month); 
 printf("\nEnter the date "); 
 scanf("%d", &date); 
 day_of_week(date, month, year); 
 getch(); 
}