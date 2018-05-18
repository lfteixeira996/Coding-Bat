import unittest

'''


The parameter weekday is True if it is a weekday, and the parameter vacation is True if we are on vacation.
We sleep in if it is not a weekday or we're on vacation. Return True if we sleep in.


sleep_in(False, False) -> True
sleep_in(True, False) -> False
sleep_in(False, True) -> True


'''

def sleep_in(weekday, vacation):
   
    if weekday and not vacation:
        return False
   
    else:
        return True
 
 
class Test_sleep_in(unittest.TestCase):

    def test_1(self):
        self.assertEqual(sleep_in(False, False), True)

    def test_2(self):
        self.assertEqual(sleep_in(True, False), False)

    def test_3(self):
        self.assertEqual(sleep_in(False, True), True)


if __name__ == '__main__':
    unittest.main()    
 
 