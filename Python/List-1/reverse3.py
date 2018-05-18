import unittest

'''


Given an array of ints length 3, return a new array with the elements in reverse order, 
so {1, 2, 3} becomes {3, 2, 1}.


reverse3([1, 2, 3]) -> [3, 2, 1]
reverse3([5, 11, 9]) -> [9, 11, 5]
reverse3([7, 0, 0]) -> [0, 0, 7]

'''

def reverse3(nums):
  
    return [nums[2], nums[1], nums[0]]
 
 
class Test_reverse3(unittest.TestCase):

    def test_1(self):
        self.assertEqual(middle_way([1, 2, 3], [4, 5, 6]), [2, 5])

    def test_2(self):
        self.assertEqual(middle_way([7, 7, 7], [3, 8, 0]), [7, 8])

    def test_3(self):
        self.assertEqual(middle_way([5, 2, 9], [1, 4, 5]), [2, 4])


if __name__ == '__main__':
    unittest.main()  