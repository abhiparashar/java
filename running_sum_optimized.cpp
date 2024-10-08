#include <iostream>
#include <vector>

using namespace std;

int main()
{
  vector<int> nums = {4, 1, 6, -2, 7};
  vector<int> vec(nums.size());
  vec[0] = nums[0];
  for (int i = 1; i < nums.size(); i++)
  {
    vec[i] = vec[i - 1] + nums[i];
  }
  for (int i = 0; i < vec.size(); i++)
  {
    cout << vec[i] << " ";
  }
  cout << endl;
  return 0;
}