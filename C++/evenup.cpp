#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n;
    cin>>n;
    vector<int> vec;
    int x;
    cin>>x;
    vec.push_back(x);
    for(int i=1;i<n;i++){
      cin>>x;
      vec.push_back(x);
      if(vec.size()>1 && (vec[vec.size()-1]+vec[vec.size()-2])%2==0){
        vec.pop_back();
        vec.pop_back();
      }
    }
    cout<<vec.size();
    return 0;
}