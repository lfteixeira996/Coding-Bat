import unittest

'''
Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.


sum2([1, 2, 3]) -> 3
sum2([1, 1]) -> 2
sum2([1, 1, 1, 1]) -> 2
'''

def sum2(nums):
  
    lenght = len(nums)
 
    if lenght == 0:
        return 0
  
    elif  lenght < 2:
        return nums[0]
  
    elif  lenght >= 2:
        return nums[0]+ nums[1]
   
class Test_sum2(unittest.TestCase):

    def test_1(self):
        self.assertEqual(sum2([1, 2, 3]), 3)

    def test_2(self):
        self.assertEqual(sum2([1, 1]), 2)

    def test_3(self):
        self.assertEqual(sum2([1, 1, 1, 1]), 2)

if __name__ == '__main__':
    unittest.main()    