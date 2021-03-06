import unittest

'''
Given an array of ints length 3, return the sum of all the elements.


sum3([1, 2, 3]) -> 6
sum3([5, 11, 2]) -> 18
sum3([7, 0, 0]) -> 7

'''

def sum3(nums):
  
    val = 0 
 
    for i in range(0,3):
        val = val + nums[i]
  
    return val  
 
 
class Test_sum3(unittest.TestCase):

    def test_1(self):
        self.assertEqual(sum3([1, 2, 3]), 6)

    def test_2(self):
        self.assertEqual(sum3([5, 11, 2]), 18)

    def test_3(self):
        self.assertEqual(sum3([7, 0, 0]), 7)

if __name__ == '__main__':
    unittest.main()   