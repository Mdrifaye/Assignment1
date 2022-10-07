#include<stdio.h>
#include<conio.h>
#include<math.h>

 int day_of_week(int date, int month, int year) { 
 int dayOfWeek; 
 int YY = year % 100; 
 int century = year / 100; 
 printf("\nDate: %d/%d/%d \n", date, month, year); 
 dayOfWeek = 1.25 * YY + fm(date, month, year) + date - 2 * (century % 4); 
 //remainder on division by 7
 dayOfWeek = dayOfWeek % 7; 
 switch (dayOfWeek) { 
 case 0: 
 printf("weekday = Saturday"); 
 break; 
 case 1: 
 printf("weekday = Sunday"); 
 break; 
 case 2: 
 printf("weekday = Monday"); 
 break; 
 case 3: 
 printf("weekday = Tuesday"); 
 break; 
 case 4: 
 printf("weekday = Wednesday"); 
 break; 
 case 5: 
 printf("weekday = Thursday"); 
 break; 
 case 6: 
 printf("weekday = Friday"); 
 break; 
 default: 
 printf("Incorrect data"); 
 } 
 return 0; 
}