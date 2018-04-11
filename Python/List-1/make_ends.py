import unittest

'''
Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.


make_ends([1, 2, 3]) -> [1, 3]
make_ends([1, 2, 3, 4]) -> [1, 4]
make_ends([7, 4, 6, 2]) -> [7, 2]

'''

def make_ends(nums):
 
 if len(nums)==1:
  return [nums[0], nums[0]]

  
 elif len(nums)>1:
  return [nums[0], nums[len(nums)-1]]
  
 return nums 
 
 
class Test_make_ends(unittest.TestCase):

    def test_1(self):
        self.assertEqual(make_ends([1, 2, 3]), [1, 3])

    def test_2(self):
        self.assertEqual(make_ends([1, 2, 3]), [1, 3])

    def test_3(self):
        self.assertEqual(make_ends([7, 4, 6, 2]), [7, 2])


if __name__ == '__main__':
    unittest.main()   