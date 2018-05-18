import unittest

'''

The squirrels in Palo Alto spend most of the day playing. 
In particular, they play if the temperature is between 60 and 90 (inclusive). 
Unless it is summer, then the upper limit is 100 instead of 90. 
Given an int temperature and a boolean is_summer, return True if the squirrels play and False otherwise.


squirrel_play(70, False) -> True
squirrel_play(95, False) -> False
squirrel_play(95, True) -> True

'''

def squirrel_play(temp, is_summer):

    if not is_summer and temp>=60 and temp<=90:
        return True
  
    elif is_summer and temp>=60 and temp<=100:
        return True
  
    return False 
  
  
class Test_squirrel_play(unittest.TestCase):

    def test_1(self):
        self.assertEqual(squirrel_play(70, False), True)

    def test_2(self):
        self.assertEqual(squirrel_play(95, False), False)

    def test_3(self):
        self.assertEqual(squirrel_play(95, True), True)


if __name__ == '__main__':
    unittest.main()    
