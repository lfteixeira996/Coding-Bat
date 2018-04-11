import unittest

'''

Given an array of ints, return True if the array is length 1 or more, and the first element and the last element are equal.


same_first_last([1, 2, 3]) -> False
same_first_last([1, 2, 3, 1]) -> True
same_first_last([1, 2, 1]) -> True

'''

def same_first_last(nums):
  
 if len(nums)>=1 and (nums[0] == nums[len(nums)-1]):
  return True
  
 return False 
 
 
class Test_same_first_last(unittest.TestCase):

    def test_1(self):
        self.assertEqual(same_first_last([1, 2, 3]), False)

    def test_2(self):
        self.assertEqual(same_first_last([1, 2, 3, 1]), True)

    def test_3(self):
        self.assertEqual(same_first_last([1, 2, 1]), True)

if __name__ == '__main__':
    unittest.main()  