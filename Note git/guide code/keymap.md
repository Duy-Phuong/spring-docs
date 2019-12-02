Tổng hợp phím tắt của Visual Studio Code
Nguồn
Tham khảo tại https://code.visualstudio.com/docs/getstarted/keybindings

https://topdev.vn/blog/tong-hop-phim-tat-cua-visual-studio-code/?fbclid=IwAR0bWRrPUQWHrwdUbfJCKCOJlMpzUMJOS-WaxuK7-0EumdjAuXf-r_l7tGM





## Lời nói đầu
Trong những năm qua, tôi đã sử dụng một loạt các Code Editor khác nhau; TextMate, Php Storm, Sublime Text, Atom, và mỗi cái có những ưu điểm và nhược điểm khác nhau. Tuy nhiên, Visual Studio Code thì tôi đã hoàn toàn bị thuyết phục cho đến lúc này. Có rất nhiều các bài viết về tính năng vượt trội của nó so với các Code editor khác. Tuy nhiên trong bài viết này tôi sẽ chỉ chia sẻ về các phím tắt của Visual Studio Code sẽ giúp chúng ta tối ưu các thao tác hơn trong quá trình xử lý. Để xem bảng các phím tắt này chúng ta có thể bật Visual Studio Code lên và vào các mục File > Preferences > Keyboard Shortcuts. (Code > Preferences > Keyboard Shortcuts on macOS)


Các phím tắt dưới đây sẽ dùng cho macOS nếu bạn dùng Win chỉ cần thay  ⌘ => Ctrl, ⇧ => Shift, ⌥ => Alt

## Basic Editing
Key	Command
CTRL X	Cut line (empty selection)
CTRL C	Copy line (empty selection)
Shift CTRL K	Delete Line
CTRL Enter	Insert Line Below
Shift CTRL Enter	Insert Line Above
ALT ↓	Move Line Down
ALT ↑	Move Line Up
Shift ALT ↓	Copy Line Down
Shift ALT ↑	Copy Line Up
CTRL D	Add Selection To Next Find Match
CTRL K CTRL D	Move Last Selection To Next Find Match
CTRL U	Undo last cursor operation
Shift ALT I	Insert cursor at end of each line selected
Shift CTRL L	Select all occurrences of current selection
CTRL F2	Select all occurrences of current word
CTRL L	Select current line
ALT CTRL ↓	Insert Cursor Below
ALT CTRL ↑	Insert Cursor Aove
Shift CTRL \	Jump to matching bracket
CTRL ]	Indent Line
CTRL [	Outdent Line


## Home	Go to Beginning of Line
End	Go to End of Line
CTRL ↓	Go to End of File
CTRL ↑	Go to Beginning of File
⌃PageDown	Scroll Line Down
⌃PageUp	Scroll Line Up
CTRL PageDown	Scroll Page Down
CTRL PageUp	Scroll Page Up
ALT CTRL [	Fold (collapse) region
ALT CTRL ]	Unfold (uncollapse) region
CTRL K CTRL [	Fold (collapse) all subregions
CTRL K CTRL ]	Unfold (uncollapse) all subregions
CTRL K CTRL 0	Fold (collapse) all regions
CTRL K CTRL J	Unfold (uncollapse) all regions
CTRL K CTRL C	Add Line Comment
CTRL K CTRL U	Remove Line Comment
CTRL /	Toggle Line Comment
Shift ALT A	Toggle Block Comment
CTRL F	Find
ALT CTRL F	Replace
CTRL G	Find Next
Shift CTRL G	Find Previous
ALT Enter	Select All Occurrences of Find Match
ALT CTRL C	Toggle Find Case Sensitive
ALT CTRL R	Toggle Find Regex
ALT CTRL W	Toggle Find Whole Word
⌃Shift M	Toggle Use of Tab Key for Setting Focus
unassigned	Toggle Render Whitespace
ALT Z	Toggle Word Wrap

## Rich Languages Editing
Key	Command
⌃Space	Trigger Suggest
Shift CTRL Space	Trigger Parameter Hints
Shift ALT F	Format Document
CTRL K CTRL F	Format Selection
F12	Go to Definition
CTRL K CTRL I	Show Hover
ALT F12	Peek Definition
CTRL K F12	Open Definition to the Side
CTRL .	Quick Fix
Shift F12	Peek References
F2	Rename Symbol
Shift CTRL .	Replace with Next Value
Shift CTRL ,	Replace with Previous Value
⌃Shift CTRL →	Expand AST Selection
⌃Shift CTRL ←	Shrink AST Selection
CTRL K CTRL X	Trim Trailing Whitespace
CTRL K M	Change Language Mode

## Navigation
Key	Command
CTRL T	Show All Symbols
⌃G	Go to Line…
CTRL P	Go to File…, Quick Open
Shift CTRL O	Go to Symbol…
Shift CTRL M	Show Problems
F8	Go to Next Error or Warning
Shift F8	Go to Previous Error or Warning
Shift CTRL P	Show All Commands
⌃Shift Tab	Navigate Editor Group History
⌃-	Go Back
⌃-	Go back in Quick Input
⌃Shift -	Go Forward

## Editor/Window Management
Key	Command
Shift CTRL N	New Window
Shift CTRL W	Close Window
CTRL W	Close Editor
CTRL K F	Close Folder
CTRL \	Split Editor
CTRL 1	Focus into First Editor Group
CTRL 2	Focus into Second Editor Group
CTRL 3	Focus into Third Editor Group
CTRL K Shift CTRL ←	Move Editor Left
CTRL K Shift CTRL →	Move Editor Right
CTRL K ←	Move Active Editor Group Left
CTRL K →	Move Active Editor Group Right
⌃CTRL →	Move Editor into Next Group
⌃CTRL ←	Move Editor into Previous Group

## File Management
Key	Command
CTRL N	New File
CTRL S	Save
ALT CTRL S	Save All
Shift CTRL S	Save As…
CTRL W	Close
ALT CTRL T	Close Others
CTRL K W	Close Group
CTRL K CTRL W	Close All
Shift CTRL T	Reopen Closed Editor
CTRL K Enter	Keep Open
⌃Tab	Open Next
⌃Shift Tab	Open Previous
CTRL K P	Copy Path of Active File
CTRL K R	Reveal Active File in Windows
CTRL K O	Show Opened File in New Window

## Display
Key	Command
⌃CTRL F	Toggle Full Screen
CTRL K Z	Toggle Zen Mode
Escape Escape	Leave Zen Mode
CTRL =	Zoom in
CTRL -	Zoom out
CTRL Numpad0	Reset Zoom
CTRL B	Toggle Sidebar Visibility
Shift CTRL E	Show Explorer / Toggle Focus
Shift CTRL F	Show Search
⌃Shift G	Show Source Control
Shift CTRL D	Show Debug
Shift CTRL X	Show Extensions
Shift CTRL U	Show Output
⌃Q	Quick Open View
Shift CTRL C	Open New Command Prompt
Shift CTRL V	Toggle Markdown Preview
CTRL K V	Open Preview to the Side
⌃`	Toggle Integrated Terminal
Search
Key	Command
Shift CTRL F	Show Search
Shift CTRL H	Replace in Files
ALT CTRL C	Toggle Match Case
ALT CTRL W	Toggle Match Whole Word
ALT CTRL R	Toggle Use Regular Expression
Shift CTRL J	Toggle Search Details
F4	Focus Next Search Result
Shift F4	Focus Previous Search Result
↓	Show Next Search Term
↑	Show Previous Search Term
Preferences
Key	Command
CTRL ,	Open Settings
CTRL K CTRL S	Open Keyboard Shortcuts
CTRL K CTRL T	Select Color Theme

## Debug
Key	Command
F9	Toggle Breakpoint
F5	Start
F5	Continue
⌃F5	Start (without debugging)
F6	Pause
F11	Step Into
Shift F11	Step Out
F10	Step Over
Shift F5	Stop
CTRL K CTRL I	Show Hover
## Tasks
Key	Command
Shift CTRL B	Run Build Task
Shift CTRL T	Run Test Task