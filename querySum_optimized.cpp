#include <iostream>
#include <vector>
using namespace std;
void calculateSum(vector<int> &vec, vector<pair<int, int>> &queries)
{
  vector<int> result;
  // calculate running sum
  for (int i = 0; i < vec.size(); i++)
  {
    int sum = 0;
    sum = sum + vec[i];
    result.push_back(sum);
  }
  for (int i = 0; i < result.size(); i++)
  {
    cout << result[i] << " ";
  }
  cout << endl;
};
int main()
{
  vector<int> vec = {-2, 5, 1, 3, 4, 1, 7, -8, 2, 0};
  vector<pair<int, int>> queries = {{3, 8}, {2, 4}, {0, 3}, {5, 9}, {6, 6}};
  calculateSum(vec, queries);
  return 0;
}