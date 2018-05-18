import unittest

'''

Given an "out" string length 4, such as "<<>>", and a word, 
return a new string where the word is in the middle of the out string, e.g. "<<word>>".


make_out_word('<<>>', 'Yay') -> '<<Yay>>'
make_out_word('<<>>', 'WooHoo') -> '<<WooHoo>>'
make_out_word('[[]]', 'word') -> '[[word]]'

'''

def make_out_word(out, word):

	return out[:2]+word+out[2:]  


class Test_make_out_word(unittest.TestCase):

    def test_1(self):
        self.assertEqual(make_out_word('<<>>', 'Yay'), '<<Yay>>')

    def test_2(self):
        self.assertEqual(make_out_word('<<>>', 'WooHoo'), '<<WooHoo>>')

    def test_3(self):
        self.assertEqual(make_out_word('<<>>', 'WooHoo'), '<<WooHoo>>')


if __name__ == '__main__':
    unittest.main()    