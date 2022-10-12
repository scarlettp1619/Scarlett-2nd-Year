module Main where

main :: IO ()
main = do
  print $ encode [3, 4, 4, 2]

{- Problem 1
Find the last element of a list -}
myLast :: [a] -> a
myLast [x]
  = x
myLast (_:xs)
  = myLast xs

{- Problem 2
Find the last but 1 element of a list -}
myButLast :: [a] -> a
myButLast x = reverse x !! 1

{- Problem 3
Find nth element of a list where the first element is 1 -}
elementAt :: [a] -> Int -> a
elementAt x e
  = x !! (e - 1)

{- Problem 4
Find the number of elements in a list -}
myLength :: [Int] -> Int
myLength []
  = 0
myLength (x:xs)
  = myLength xs + 1

{- Problem 5
Reverse a list -}
myReverse :: [Int] -> [Int]
myReverse []
  = []
myReverse (x:xs)
  = myReverse xs ++ [x]

{- Problem 6
Found out whether a list is a palindrome -}
isPalindrome :: [Int] -> Bool
isPalindrome xs
  = xs == (myReverse xs)

{- Problem 7
Flatten a nested list structure -}
data NestedList a = Elem a | List [NestedList a]

flatten :: NestedList a -> [a]
flatten (Elem a) = [a]
flatten (List (x:xs)) = flatten x ++ flatten (List xs)
flatten (List []) = []

{- Problem 8
Eliminate consecutive duplicates of list elements -}
compress :: [Int] -> [Int]
compress []
  = []
compress [x]
  = [x]
compress (x1:x2:xs)
  | x1 == x2 = compress (x2:xs)
  | otherwise = x1:compress (x2:xs)

{- Problem 9
Pack consecutive duplicates of list elements into sublists. If a list contains repeated
elements they should be placed in separate sublists. -}
pack :: (Eq a) => [a] -> [[a]]
pack []
  = []
pack [x]
  = [[x]]
pack (x:xs)
  | x == head h_p_xs = (x:h_p_xs):t_p_hs
  | otherwise        = [x]:p_xs
  where p_xs@(h_p_xs:t_p_hs) = pack xs

{- Problem 10
Run-length encoding of a list. Use the result of problem P09 to implement the so-called
run-length encoding data compression method. Consecutive duplicates of elements are
encoded as lists (N E) where N is the number of duplicates of the element E. -}
encode :: Eq a => [a] -> [(Int, a)]
encode =
  map (\x -> (length x, head x)) . pack
