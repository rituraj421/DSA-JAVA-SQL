-- Write an sql Query to fins th ID's of the Invalid tweets. The tweets are invalid id the number of characters used in the content of the tweet is strictly greater than 15


SELECT tweet_id FROM Tweets WHERE length(content) > 15;