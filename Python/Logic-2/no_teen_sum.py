import unittest

'''

Given 3 int values, a b c, return their sum.
However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0,
except 15 and 16 do not count as a teens. 
Write a separate helper "def fix_teen(n):"that takes in an int value and returns that value fixed for the teen rule. 
In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). 
Define the helper below and at the same indent level as the main no_teen_sum().


no_teen_sum(1, 2, 3) -> 6
no_teen_sum(2, 13, 1) -> 3
no_teen_sum(2, 1, 14) -> 3

'''

def fix_teen(n):
    
    if n>=10 and n<=19 and n!=15 and n!=16:
        return False
    
    return True
        

def no_teen_sum(a, b, c):
  
    count = 0
    
    if(fix_teen(a) == True):
        count += a        
        
    if(fix_teen(b) == True):
        count += b   
        
    if(fix_teen(c) == True):
        count += c    
        
    return count 



class Test_no_teen_sum(unittest.TestCase):

    def test_1(self):
        self.assertEqual(no_teen_sum(1, 2, 3), 6)

    def test_2(self):
        self.assertEqual(no_teen_sum(2, 13, 1), 3)

    def test_3(self):
        self.assertEqual(no_teen_sum(2, 1, 14), 3)


if __name__ == '__main__':
    unittest.main()   