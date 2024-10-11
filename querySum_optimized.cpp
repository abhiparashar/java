#include <iostream>
#include <vector>
using namespace std;

vector<int> calculateSum(vector<int> &vec, vector<pair<int, int>> &queries)
{
  // Calculate running sum
  vector<int> prefix(vec.size());
  prefix[0] = vec[0];
  for (int i = 1; i < vec.size(); i++)
  {
    prefix[i] = prefix[i - 1] + vec[i];
  }

  // Store results
  vector<int> results;
  for (const auto &query : queries)
  {
    int l = query.first;
    int r = query.second;
    results.push_back(prefix[r] - prefix[l - 1]);
  }
  return results;
}

int main()
{
  vector<int> vec = {-2, 5, 1, 3, 4, 1, 7, -8, 2, 0};
  vector<pair<int, int>> queries = {{3, 8}, {2, 4}, {0, 3}, {5, 9}, {6, 6}};

  vector<int> results = calculateSum(vec, queries);

  // Print results
  for (int sum : results)
  {
    cout << sum << " ";
  }
  cout << endl;

  return 0;
}