import unittest

'''

We have two monkeys, a and b, and the parameters a_smile and b_smile indicate if each is smiling. 
We are in trouble if they are both smiling or if neither of them is smiling. Return True if we are in trouble.


monkey_trouble(True, True)     -> True
monkey_trouble(False, False)   -> True
monkey_trouble(True, False)    -> False

'''

def monkey_trouble(a_smile, b_smile):
  if a_smile and not b_smile:
    return False
  elif not a_smile and b_smile:
   return False
  else:
    return True  


class Test_monkey_trouble(unittest.TestCase):

    def test_1(self):
        self.assertEqual(monkey_trouble(True, True),   True)

    def test_2(self):
        self.assertEqual(monkey_trouble(False, False), True)

    def test_3(self):
        self.assertEqual(monkey_trouble(True, False),  False)


if __name__ == '__main__':
    unittest.main() 