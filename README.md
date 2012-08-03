License:
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

Credits:
	Credit for the following classes and their methods goes to
	The University of Texas at Austin. They did a fantastic job on 
	this library and it is much appreciated.
	(md4.java/MD5crypt.java/Sha256Crypt.java/Sha512Crypt.java/smbencrypt.java)


jCrack
======
Java password cracker

Developed by: Shane Peters
Version: 0.1beta
Bugs: prestigesec.com@gmail.com

Usage:
=======
./jCrack.sh <wordlist> <hashlist> <hashtype[sha256,sha512]>

Hashes should be in the format below:
$6$7OTbh83L$VLyjw016rHCMqyYRVrtjDuP1/e2JLuRIomU6KHSQqn/H8ctnUIv/Gk6zn4FmcR97ZpKwvLDtlxSXH4fHp9RPF.

$6$ == sha-512
$5$ == sha-256

Example(for hash above): ./jCrack.sh wordlist.txt hashlist.txt sha512

Changes:
=========
- Added sha256 capability
- Now able crack hashes with variable length salts

Future Enhancements:
====================
- More hash types (md4,md5,smb)
- Multi threading
- jCuda utilization (GPU Cracking)


