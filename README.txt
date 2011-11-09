OpenURL PhoneGap Plug-in

DESCRIPTION:
A simple PhoneGap plug-in to launch a URL in a new browser on the iPhone.
Simply call the plug-in from JavaScript upon any button click event to launch the Safari browser to your url.

IPHONE SETUP:
1. Copy the files OpenURL.h and OpenURL.m into your PhoneGap project's Plugins folder.
2. Edit PhoneGap.plist, in the section "Plugins", add an entry "OpenURL" with the key "OpenURL".

ANDROID SETUP:
1. Create a new package in your project named "com.phonegap.openurl".
2. Copy the file OpenURL.java into the package.
3. Edit res/xml/plugins.xml and add the following entry:
<plugin name="OpenURL" value="com.phonegap.openurl.OpenURL"/>

USAGE:
From javascript simply call:

// iPhone
PhoneGap.exec('OpenURL.open', 'http://www.primaryobjects.com');

// Android
PhoneGap.exec(null, null, 'OpenURL', 'open', 'http://www.primaryobjects.com');

More advanced example:

function launchUrl() {
    // Get the URL from an ahref link named 'webSite'.
    var url = $('#webSite').attr('href');
    
    if (isMobileDevice()) {
	// iPhone url
	PhoneGap.exec('OpenURL.open', url);
    }
    else {
	// Web browser url
        window.open(url);
    }
}

Of course, you'll need to install http://www.phonegap.com.

---
Copyright © 2011 Kory Becker (http://www.primaryobjects.com)

Permission is hereby granted, free of charge, to any person obtaining
a copy of this software and associated documentation files (the
"Software"), to deal in the Software without restriction, including
without limitation the rights to use, copy, modify, merge, publish,
distribute, sublicense, and/or sell copies of the Software, and to
permit persons to whom the Software is furnished to do so, subject to
the following conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
