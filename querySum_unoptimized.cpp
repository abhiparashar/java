#include <iostream>
#include <vector>
using namespace std;
void calculateSum(vector<int> vec, vector<pair<int, int>> queries)
{
  vector<int> temp;
  for (int i = 0; i < queries.size(); i++)
  {
    int l = queries[i].first;
    int r = queries[i].second;
    int sum = 0;
    for (int j = l; j <= r; j++)
    {
      sum += vec[j];
    }
    temp.push_back(sum);
  }
  for (int i = 0; i < temp.size(); i++)
  {
    cout << temp[i] << " ";
  }
  cout << endl;
}
int main()
{
  vector<int> vec = {-2, 5, 1, 3, 4, 1, 7, -8, 2, 0};
  vector<pair<int, int>> queries = {{3, 8}, {2, 4}, {0, 3}, {5, 9}, {6, 6}};
  calculateSum(vec, queries);
  return 0;
}