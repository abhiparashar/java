#include <iostream>
#include <vector>
using namespace std;
int main()
{
  vector<int> nums = {4, 1, 6, -2, 7};
  vector<int> result;
  for (int i = 0; i < nums.size(); i++)
  {
    int sum = 0;
    for (int j = 0; j <= i; j++)
    {
      sum = sum + nums[j];
    }
    result.push_back(sum);
  }
  for (int i = 0; i < result.size(); i++)
  {
    cout << result[i] << " ";
  }
  cout << endl;
  return 0;
}