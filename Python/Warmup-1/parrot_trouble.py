import unittest

'''


We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return True if we are in trouble.


parrot_trouble(True, 6)  -> True
parrot_trouble(True, 7)  -> False
parrot_trouble(False, 6) -> False

'''

def parrot_trouble(talking, hour):
 if talking and (hour<7 or hour>20):
  return True
  
 return False    


 
class Test_parrot_trouble(unittest.TestCase):

    def test_1(self):
        self.assertEqual(parrot_trouble(True, 6), True)

    def test_2(self):
        self.assertEqual(parrot_trouble(True, 7), False)

    def test_3(self):
        self.assertEqual(parrot_trouble(False, 6), False)


if __name__ == '__main__':
    unittest.main()   