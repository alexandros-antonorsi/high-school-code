#include <iostream>
#include <string>
using namespace std;

int nums [4][4];
bool combined [4][4];
int direction;

void print(){
    for(int x=0;x<4;x++){
    	for(int y=0;y<4;y++){
    		cout<<nums[x][y]<<' ';
    	}
    	cout<<endl;
    }
}

void rotate90(){
  int arr[4][4];
  for(int x=0;x<4;x++)
    for(int y=0;y<4;y++)
      arr[x][y] = nums[4-y-1][x];
  for(int i=0;i<4;i++)
    for(int j=0;j<4;j++)
      nums[i][j] = arr[i][j];
}

void moveLeft(){
	for(int x=0;x<4;x++){
		for(int y=0;y<4;y++){
			if(nums[x][y]==0){
				int i =y+1;
				while(i<3 && nums[x][i]==0){
					i++;
				}
				if(i<4 && nums[x][i]!=0){
				  nums[x][y]=nums[x][i];
				  nums[x][i]=0;
				}
			}
			
			int z = y+1;
			while(z<3 && nums[x][z]==0){
				z++;
			}
			if(z<4 && nums[x][z]!=0 && nums[x][z]==nums[x][y] && !combined[x][y] && !combined[x][z]){
				nums[x][y]+=nums[x][z];
				nums[x][z]=0;
				combined[x][y]=true;
			}
		}
	}
}

int main(){
	for(int x=0;x<4;x++){
		for(int y=0;y<4;y++){
			cin>>nums[x][y];
		}
	}
	int dir;
	cin>>dir;
	for(int x=0;x<4;x++){
		for(int y=0;y<4;y++){
			combined[x][y] = false;
		}
	}
	for(int i=0;i<4-dir;i++){
	  rotate90();
	}
	moveLeft();
	for(int i=0;i<dir;i++){
	  rotate90();
	}
	print();
	return 0;
}

