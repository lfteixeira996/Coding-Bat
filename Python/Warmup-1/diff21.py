import unittest
'''

Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.


diff21(19) -> 2
diff21(10) -> 11
diff21(21) -> 0

'''

def diff21(n):
  
 if n > 21:
  return 2*(n-21)
  
 return 21-n 
 
 
class Test_diff21(unittest.TestCase):

    def test_1(self):
        self.assertEqual(diff21(19), 2)

    def test_2(self):
        self.assertEqual(diff21(10), 11)

    def test_3(self):
        self.assertEqual(diff21(21), 0)


if __name__ == '__main__':
    unittest.main() 
    
    
