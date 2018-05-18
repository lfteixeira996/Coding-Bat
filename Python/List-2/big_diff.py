import unittest

'''

Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
Note: the built-in min(v1, v2) and max(v1, v2) functions return the smaller or larger of two values.


big_diff([10, 3, 5, 6]) -> 7
big_diff([7, 2, 10, 9]) -> 8
big_diff([2, 10, 7, 2]) -> 8

'''

def big_diff(nums):
  
    max_val = nums[0] 
    min_val = nums[0]
  
    for i in range(1,len(nums)):
        max_val = max(max_val, nums[i])
        min_val = min(min_val, nums[i])
    
    return max_val-min_val  


class Test_big_diff(unittest.TestCase):

    def test_1(self):
        self.assertEqual(big_diff([10, 3, 5, 6]), 7)

    def test_2(self):
        self.assertEqual(big_diff([7, 2, 10, 9]), 8)

    def test_3(self):
        self.assertEqual(big_diff([2, 10, 7, 2]), 8)


if __name__ == '__main__':
    unittest.main() 