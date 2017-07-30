# Pre-work - Checkbox

Checkbox is an android app that allows building a todo list and basic todo items management functionality including adding new items, editing and deleting an existing item.

Submitted by: Karen Li

Time spent: 20 hours spent in total

## User Stories

The following **required** functionality is completed:

* [x] User can **successfully add and remove items** from the todo list
* [x] User can **tap a todo item in the list and bring up an edit screen for the todo item** and then have any changes to the text reflected in the todo list.
* [x] User can **persist todo items** and retrieve them properly on app restart

The following **optional** features are implemented:

* [ ] Persist the todo items [into SQLite](http://guides.codepath.com/android/Persisting-Data-to-the-Device#sqlite) instead of a text file
* [attempted in separate branch (RestructureCodeBug)] Improve style of the todo items in the list [using a custom adapter](http://guides.codepath.com/android/Using-an-ArrayAdapter-with-ListView)
* [ ] Add support for completion due dates for todo items (and display within listview item)
* [attempted in separate branch] Use a [DialogFragment](http://guides.codepath.com/android/Using-DialogFragment) instead of new Activity for editing items
* [ ] Add support for selecting the priority of each todo item (and display in listview item)
* [attempted in separate branch] Tweak the style improving the UI / UX, play with colors, images or backgrounds

The following **additional** features are implemented:

* [ ] List anything else that you can get done to improve the app functionality!

## Video Walkthrough

Here's a walkthrough of implemented user stories:

http://imgur.com/ZWCCD7j

<img src='http://imgur.com/ZWCCD7j' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Project Analysis

As part of your pre-work submission, please reflect on the app and answer the following questions below:

**Question 1:** "What are your reactions to the Android app development platform so far? Compare and contrast Android's approach to layouts and user interfaces in past platforms you've used."

**Answer:** The pre-work assignment allowed me to learn several Android basics such as creation of activities, and the communication between activity layouts and backend logic through the use of Listeners and xml. However, I am still hoping to learn more about proper coding conventions in terms of separation between frontend and backend logic, as my code still seems to intertwine the two. I played around with reorganizing code to separate this logic through a controller in a different branch. However, I was unsuccessful in compiling this code, and will continue working on this branch to modify my code structure. I also hope to learn more about this through the Android CodePath online class. Also, there are many different types of GUI components that I would like to learn about, and which components are best suited for which user cases.

**Question 2:** "Take a moment to reflect on the `ArrayAdapter` used in your pre-work. How would you describe an adapter in this context and what is its function in Android? Why do you think the adapter is important? Explain the purpose of the `convertView` in the `getView` method of the `ArrayAdapter`."

**Answer:** The ArrayAdapter aids in building the layout component associated with backend logic stored in an array or list data structure. The ArrayAdapter in the context of our project allows for updates in the layout whenever our todo list changes (for example, an item is added, edited, or deleted). This is done using the `notifyDataSetChanged()` method of the ArrayAdapter. The `convertView` is the `View` object that defines the layout, and can be reused, to display the data that is desired and called by the `getView()` method of the `ArrayAdapter`.

## Notes

Describe any challenges encountered while building the app:
As I mentioned before, I am still hoping to learn more about proper coding conventions in terms of separation between frontend and backend logic, as my code still seems to intertwine the two.

## License

    Copyright [yyyy] [name of copyright owner]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
