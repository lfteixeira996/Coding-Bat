import unittest

'''

Return the sum of the numbers in the array, except ignore sections of numbers 
starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). 
Return 0 for no numbers.


sum67([1, 2, 2]) -> 5
sum67([1, 2, 2, 6, 99, 99, 7]) -> 5
sum67([1, 1, 6, 7, 2]) -> 4

'''

def sum67(nums):
  
    flag = True
    sum = 0
  
    for item in nums:
        if (item == 6):
            flag = False
     
        if(flag == True):
            sum += item
      
        if(item == 7):
            flag = True
    
    return sum   
  
  
class Test_sum67(unittest.TestCase):

    def test_1(self):
        self.assertEqual(sum67([1, 2, 2]), 5)

    def test_2(self):
        self.assertEqual(sum67([1, 2, 2, 6, 99, 99, 7]), 5)

    def test_3(self):
        self.assertEqual(sum67([1, 1, 6, 7, 2]), 4)


if __name__ == '__main__':
    unittest.main()   
  
  
  
  
  
 
