import unittest

'''

Given 3 int values, a b c, return their sum. 
However, if one of the values is 13 then it does not 
count towards the sum and values to its right do not count. 
So for example, if b is 13, then both b and c do not count.


lucky_sum(1, 2, 3) -> 6
lucky_sum(1, 2, 13) -> 3
lucky_sum(1, 13, 3) -> 1

'''

def lucky_sum(a, b, c):
  
    res = 0
   
    if a==13: 
        return 0
    
    elif b==13: 
        return a
 
    elif c==13: 
        return (a+b)

    else:
        return (a+b+c) 
    
    
class Test_lucky_sum(unittest.TestCase):

    def test_1(self):
        self.assertEqual(lucky_sum(1, 2, 3), 6)

    def test_2(self):
        self.assertEqual(lucky_sum(1, 2, 13), 3)

    def test_3(self):
        self.assertEqual(lucky_sum(1, 13, 3), 1)


if __name__ == '__main__':
    unittest.main()      