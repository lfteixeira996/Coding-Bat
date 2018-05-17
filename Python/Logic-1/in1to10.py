import unittest

'''

Given a number n, return True if n is in the range 1..10, inclusive.
Unless outside_mode is True, in which case return True if the number is less or equal to 1, or greater or equal to 10.


in1to10(5, False) -> True
in1to10(11, False) -> False
in1to10(11, True) -> True

'''

def in1to10(n, outside_mode):
  
 if not outside_mode:
 
  if n>=1 and n<=10:
   return True
   
  return False
  
 else:
 
  if n>1 and n<10:
   return False
   
  return True
  
class Test_in1to10(unittest.TestCase):

    def test_1(self):
        self.assertEqual(in1to10(5, False), True)

    def test_2(self):
        self.assertEqual(in1to10(11, False), False)

    def test_3(self):
        self.assertEqual(in1to10(11, True), True)


if __name__ == '__main__':
    unittest.main()     