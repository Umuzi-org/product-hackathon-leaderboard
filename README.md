# RATING SYSTEM ACCORDING TO POSITION RANKED AT A HACKATHON
_fronend_

This repository is merged with the leaderboard repo as they work hand in hand. The project therefore consists of two components i.e 'leaderboard' and 'rating-system'.

###### leaderboard component
- This component displays the leaderboard of 10 users (fake data) fetched from the JSON file (**src/app/assets/users.json**). Routing to the component is **leaderBoard**

###### rating-system component
- This component consists of a form which requires a user to pick a position they ranked at a hackathon event and enter their full names (**full names must exist in the leaderboard**). Routing to the component is **ratingSystem**. Based on the position they choose, the JSON data is updated, click **F12** and nevigate to **console** on the pane that will appear in your browser to see if the changes took effect.

**task in progress**

_The updated data is supposed to be sent to the backend for verification before updating on the leaderboard component_
