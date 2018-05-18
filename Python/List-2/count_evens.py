import unittest

'''
Return the number of even ints in the given array. 
Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.


count_evens([2, 1, 2, 3, 4]) -> 3
count_evens([2, 2, 0]) -> 3
count_evens([1, 3, 5]) -> 0

'''

def count_evens(nums):
  
    count = 0
  
    for item in range(len(nums)):
    
        if nums[item]%2 == 0:
            count +=1
  
    
    return count  

class Test_count_evens(unittest.TestCase):

    def test_1(self):
        self.assertEqual(count_evens([2, 1, 2, 3, 4]), 3)

    def test_2(self):
        self.assertEqual(count_evens([2, 2, 0]), 3)

    def test_3(self):
        self.assertEqual(count_evens([1, 3, 5]), 0)


if __name__ == '__main__':
    unittest.main() 