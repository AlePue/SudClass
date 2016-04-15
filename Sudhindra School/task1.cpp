#include <iostream>
using namespace std;

class Rectangle {
    double width, height;
  public:
    void set_values (int,int);

    double area(){
    	return width*height;
    }
    double perimeter(){ 
    	return 2*width+2*height;
    }
};

class Square : public Rectangle {
    double width, height;
  public:
    void set_values (int,int);

    double area(){
    	return width*height;
    }
    double perimeter(){ 
    	return 2*width+2*height;
    }
};

void Rectangle::set_values (int x, int y) {
  width = x;
  height = y;
}
void Square::set_values (int x, int y){
	width = x;
	height = y;
}




int main () {
  
  
double x, y;

cout << "Enter Height" << endl;
cin >> x;
if (x<1){
	exit(1);
}
cout << "Enter Width" << endl;
cin >> y;
if (y<1){
	exit(1);
}
int menu;
if (x!=y){
Rectangle rect;
  rect.set_values (x,y);
    cout << " Press 1 for area, 2 for perimeter, or 3 for both of your Rectangle" << endl;
	cin >> menu;
	
   if(menu == 1){
	cout << "Area: " << rect.area() << endl;
  }
   if(menu == 2){
	cout << "Perimeter: " << rect.perimeter() << endl;
  }
   if(menu == 3){
 	cout << "Area: " << rect.area() << endl;
 	cout << "Perimeter: " << rect.perimeter() << endl;
  }
}
else {
	Square sqr;
	sqr.set_values (x,y);


	

  		cout << " Press 1 for area, 2 for perimeter, or 3 for both of your Square" << endl;
		cin >> menu;
	
   		if(menu == 1){
		cout << "Area: " << sqr.area() << endl;
  		}
 	 	if(menu == 2){
		cout << "Perimeter: " << sqr.perimeter() << endl;
  		}
   		if(menu == 3){
 		cout << "Area: " << sqr.area() << endl;
 		cout << "Perimeter: " << sqr.perimeter() << endl;
  		}

  	}
  return 0;
}





